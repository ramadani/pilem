package id.ramadani.pilem.presenter;

import id.ramadani.pilem.view.MovieView;

/**
 * Created by dani on 4/24/17.
 */

public class PopularMoviePresenter extends MoviePresenter implements MoviePresenterContract {
    @Override
    public void setView(MovieView view) {
        this.view = view;
    }

    @Override
    public void load(int page) {
        view.showProgress();
        mService.popular(page).enqueue(new MovieListCallback(view));
    }
}
