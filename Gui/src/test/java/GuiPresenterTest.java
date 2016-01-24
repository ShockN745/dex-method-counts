import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

/**
 * Test for the Gui presenter
 */
public class GuiPresenterTest {

    @Mock
    GuiContract.View view;

//    @Mock
//    UserInterfaceBoundary.

    private GuiPresenter presenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        // Init presenter
        presenter = new GuiPresenter(view);
    }


    @Test
    public void startGui_launchJavaFx() throws Exception {
        presenter.startGui();
        verify(view).launch();
    }

    @Test
    public void openFilechooserClicked_openFilechooser() throws Exception {
        presenter.openFilechooserButtonClicked();
        verify(view).showFilechooser();
    }
}