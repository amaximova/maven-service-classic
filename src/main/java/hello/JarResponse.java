package hello;

import com.hello.world.App;

public class JarResponse {
    private final String output;

    public JarResponse() {
        this.output = App.testStr();
    }

    public String getOutput() {
        return output;
    }
}
