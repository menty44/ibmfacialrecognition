package com.blaqueyard.main;


/**
 * Created by admin on 1/22/19.
 */

import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voices;

import java.io.FileNotFoundException;
// Java code to convert
// text to speech
import java.util.Locale;
import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;

/**
 * Fredrick Oluoch
 * http://www.blaqueyard.com
 * 0720106420 | 0722508906
 * email: menty44@gmail.com
 */

public class TextToSpeech {
    public static void main(String[]args) throws FileNotFoundException {
        try
        {
            // set property as Kevin Dictionary
            System.setProperty("freetts.voices",
                    "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");

            // Register Engine
            Central.registerEngineCentral
                    ("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");

            // Create a Synthesizer
            Synthesizer synthesizer =
                    Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));

            // Allocate synthesizer
            synthesizer.allocate();

            // Resume Synthesizer
            synthesizer.resume();

            // speaks the given text until queue is empty.
            synthesizer.speakPlainText("GeeksforGeeks", null);
            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);

            // Deallocate the Synthesizer.
            synthesizer.deallocate();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
