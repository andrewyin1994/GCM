package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyAruWQ7ZIpQXMxsT5Tq7y8hIQCW-1T3bpc";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bF0lHz5YMPhPABkSfyKPJ4trRqbybtToM_pyc9ynvgpjClHt-UMv9xMVQ4vju33iuI_dAobHa3Qu0Pm5HYS5M_IRii8_Go7JU9r7GdCL0hfJd2dCk5_BEKbsdrIvAS8ehaVMVYJ");

        c.createData("Working!!", "Test message");

        return c;
    }
}

