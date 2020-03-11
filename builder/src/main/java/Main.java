/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/2/17 18:15
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Video video = director.get(new CompleteBuilder());
        Video video2 = director.get(new SimpleBuilder());
        System.out.println(video);
        System.out.println(video2);
    }
}
