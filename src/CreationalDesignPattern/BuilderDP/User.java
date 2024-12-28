package CreationalDesignPattern.BuilderDP;


// This pattern solves the problem of:
// when we have to pass so many arguments while creating an object, their order, type etc.
// with builderDP no more worries
// can make immutable object


//give the arguments step by step and build the object in the end
// do this with method chaining

public class User {
    private final String id;
    private final String name;
    private final String designation;

    private User(UserBuilder userBuilder) {
        this.id = userBuilder.id;
        this.name = userBuilder.name;
        this.designation = userBuilder.designation;
    }

    @Override
    public String toString() {
        return this.name + " " + this.id + " " + this.designation + " !";
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    static class UserBuilder {
        private String id;
        private String name;
        private String designation;

        public UserBuilder() {

        }

        public UserBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setDesignation(String designation) {
            this.designation = designation;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }
}
