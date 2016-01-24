/**
 * MVP Presenter for the Gui
 */
public class GuiPresenter implements GuiContract.Presenter {

    private GuiContract.View view;

    public GuiPresenter(GuiContract.View view) {
        this.view = view;
    }
}
