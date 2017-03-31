package com.example.nick.sendbroadcast;

import org.junit.Test;

import static org.junit.Assert.*;
import android.view.TextView;

/**
* To work on unit tests, switch the Test Artifact in the Build Variants view.
*/

   public class ApplicationTest extends ApplicationTestCase<Application> {

       @Test
       public void getString_isCorrect() throws Exception {
           MainActivity.HVAC h = new MainActivity.HVAC();

           String r = h.getString(10);
           assertEquals("10 minutes",r);

           String s = h.getString(10);
           assertEquals("10 minutes",s);

           String t = h.getString(10);
           assertEquals("10 minutes",t);

       }


       @Test
       public void timeToTemp_isCorrect() throws Exception {
           MainActivity.HVAC h = new MainActivity.HVAC();

           String r = h.timeToTemp(0.3,7,72,69);
           assertEquals(12.77,r);

           String s = h.timeToTemp(0.3,7,75,69);
           assertEquals(19.33,s);

           String t = h.timeToTemp(0.3,7,80,69);
           assertEquals(25.81,t);
       }


       @Test
       public void updateTimeToTemp_isCorrect() throws Exception {
           MainActivity.HVAC h = new MainActivity.HVAC();

           TextView v = new TextView;
           boolean x = h.updateTimeToTemp(0.3, 7, 72, 69, v);
           assertTrue(x);
       }









   @Test
   public void increasePreferred_isCorrect() throws Exception {
       MainActivity.HVAC h = new MainActivity.HVAC();
       String s = h.getString(10);
       assertEquals("10 minutes",s);

   }

   @Test
   public void decreeasePreferred_isCorrect() throws Exception {
       MainActivity.HVAC h = new MainActivity.HVAC();
       String s = h.getString(10);
       assertEquals("10 minutes",s);

   }

   @Test
   public void setTTT_isCorrect() throws Exception {
       MainActivity.HVAC h = new MainActivity.HVAC();
       String s = h.getString(10);
       assertEquals("10 minutes",s);

   }

   }


