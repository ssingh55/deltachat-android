package org.thoughtcrime.securesms;

import android.inputmethodservice.InputMethodService;
import android.view.View;

public class SecureInputMethodService extends InputMethodService {
    @Override
    public View onCreateInputView() {
        // Implement custom keyboard layout and logic here.
        // Ensure key presses are committed using currentInputConnection.commitText()
        // and avoid logging or storing sensitive input.
        return null;
    }
}
