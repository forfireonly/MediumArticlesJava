package attraction.zebra;

import attraction.tiger.Tiger;

public class TigerWatcher {
    void watchTiger(){
        Tiger tgr = new Tiger();
        tgr.printType();         //Does not compile
    }
}
