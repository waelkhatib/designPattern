public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
    private OldCoffeeMachine oldVedningMachine;
    @Override
    public void chooseFirstSelection() {
    oldVedningMachine.selectA();
    }
    private void connect(OldCoffeeMachine oldCoffeeMachine){
      this.oldVedningMachine=oldCoffeeMachine;
    }

    @Override
    public void chooseSecondSelection() {
       oldVedningMachine.selectB();
    }
}
