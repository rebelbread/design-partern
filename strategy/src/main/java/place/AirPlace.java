package place;

import fly.Fly;
import fly.SubSonicFly;
import takeOff.LongDistanceTakeOff;
import takeOff.TakeOff;

/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/3/22 18:56
 */
public class AirPlace {

    private TakeOff takeOff = new LongDistanceTakeOff();
    private Fly fly = new SubSonicFly();

    public void play() {
        takeOff.takeOff();
        fly.fly();
    }

}
