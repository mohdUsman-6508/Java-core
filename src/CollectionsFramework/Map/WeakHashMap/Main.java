package CollectionsFramework.Map.WeakHashMap;

import java.util.Map;
import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // weak reference-> garbage collector removes instantly if not in use

        WeakHashMap<String,Image> imageCache=new WeakHashMap<>();
        loadCache(imageCache);
        System.out.println("Before:"+imageCache);
        System.gc();
        Thread t=new Thread(()->{
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t.start();
        t.join();

        System.out.println("When not in use:"+imageCache);

    }

    static class Image {
        String name;

        public Image(String name) {
            this.name = name;
        }

    }

    public static void loadCache(Map<String, Image> imageCache) {
        String k1 = new String("img1");
        String k2 = new String("img2");

        imageCache.put(k1, new Image("Image 1"));
        imageCache.put(k2, new Image("Image 2"));

    }
}
