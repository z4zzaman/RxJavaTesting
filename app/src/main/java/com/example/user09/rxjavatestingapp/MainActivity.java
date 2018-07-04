package com.example.user09.rxjavatestingapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.subscribers.DisposableSubscriber;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*{
            Observable<String> source =
                    Observable.just("Testing", "One", "Two", "Three");

          //  source.subscribe(s -> Log.e(TAG, "RECEIVED: " + s)); OR


            source.subscribe(new Consumer<String>() {
              @Override
              public void accept(String s) throws Exception {
                  Log.e(TAG, "FIRST OBSERVER RECEIVED:\n " + s);
              }
          });


            Observable<Integer> count = source.map(String::length);

       //     count.subscribe(s -> Log.e(TAG, "RECEIVED: " + s)); OR

            count.subscribe(new Consumer<Integer>() {
                @Override
                public void accept(Integer integer) throws Exception {
                    Log.e(TAG, "SECOND OBSERVER RECEIVED:\n " + integer);
                }
            });
        }*/

 /*       Flowable<String> flowable = Flowable.just("Hello World");

        Subscriber<String> mySubscriber = new DisposableSubscriber<String>() {
            @Override
            public void onNext(String s) {
                Log.e(TAG, "Next");
                Log.e(TAG, s);

            }

            @Override
            public void onError(Throwable t) {
                Log.e(TAG, "Error" );
            }

            @Override
            public void onComplete() {
                Log.e(TAG, "Completed");
            }
        };

        flowable.subscribe(mySubscriber);
*/

        Disposable d =
                Flowable.just(1, 2, 3 , 4)
                        .subscribeWith(new DisposableSubscriber<Integer>() {

                            @Override
                            public void onNext(Integer integer) {
                                Log.e(TAG, "Next" );
                                Log.e(TAG, "Number:: " +integer);
                            }
                            public void onError(Throwable t) {
                                Log.e(TAG, "Error");
                            }

                            public void onComplete() {
                                Log.e(TAG, "Completed");
                            }
                        });
        d.dispose();

    }

}
