/**
 * MVP Contract for the Gui
 */
public interface GuiContract {

    interface View {
        void launch();
        void showFilechooser();
    }

    interface Presenter {
        void startGui();
        void openFilechooserButtonClicked();
    }
}
