package chapter6.demo2.light;

public class CellLight implements Light {

    private  String curState;

    private static final String CELL_LIGHT_STATE_BRIGHT = "bright";
    private static final String CELL_LIGHT_STATE_DIM = "dim";

    public CellLight() {
        this.curState = CELL_LIGHT_STATE_BRIGHT;
    }

    @Override
    public void on() {
        System.out.println("Cell light on");
    }

    @Override
    public void off() {
        System.out.println("Cell light off");
    }

    public void dim() {
        System.out.println("Cell light dim");
        if(CELL_LIGHT_STATE_DIM.equals(curState)) {
           return;
        }
        this.curState = CELL_LIGHT_STATE_DIM;
    }

    public void bright() {
        System.out.println("Cell light bright");
        if(CELL_LIGHT_STATE_BRIGHT.equals(curState)) {
           return;
        }
        this.curState = CELL_LIGHT_STATE_BRIGHT;
    }
}
