import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

/**
 * Test for the Gui presenter
 */
public class GuiPresenterTest {

    @Mock
    GuiContract.View view;

    private GuiPresenter presenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        // Init presenter
        presenter = new GuiPresenter(view);
    }


}