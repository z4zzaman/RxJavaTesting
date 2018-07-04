# README #

Following are the links that are used to create this project.

### Reference Link? ###

* https://www.androidauthority.com/app-development-with-rxjava-2-0-810009/


### Important things to know ###

* To help combat this problem, RxJava 2.0 introduced a Flowable class that allows you to control backpressure, by telling the source to emit data at a pace that the downstream Observers can process

*  In RxJava 2.0 there’s a very clear distinction between the two:
  
  -- Observables are no longer backpressured.    
 
   -- Flowables are inherently capable of supporting backpressure.
   
* The major disadvantage to the backpressure-aware Flowable, is that they do incur more of an overhead than an Observable, so in the interests of creating a high-performing app you should stick with Observables until backpressure becomes a problem. As a general rule, it’s usually safe to stick with Observables when you’re dealing with less than 1,000 emissions, or infrequent events.