package use_case.loggedIn;

/**
 * The LoginOutputBoundary interface defines methods for presenting the output of the login use case.
 * It includes operations for preparing views in case of successful and failed login attempts.
 */
public interface LoggedInOutputBoundary {

    /**
     * Prepare the view for a successful login attempt.
     *
     * @param loggedInOutputData The output data containing user information.
     */
    void prepareSuccessView(LoggedInOutputData loggedInOutputData);

    /**
     * Prepare the view for a failed login attempt.
     *
     * @param errorMessage The error message to be displayed.
     */
    void prepareFailView(String errorMessage);

    void switchPageLogOut();

    void switchPageOrder();

    void switchPageSearch();

    void switchPageShoppingCart();

    void switchPageStorePage();
}