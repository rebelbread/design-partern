package place;

import fly.Fly;
import fly.SubSonicFly;
import takeOff.TakeOff;
import takeOff.VerticalTakeOff;

/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/3/22 19:06
 */
public class Helicopter {

    private TakeOff takeOff = new VerticalTakeOff();
    private Fly fly = new SubSonicFly();

    public void play() {
        takeOff.takeOff();
        fly.fly();
    }

}
