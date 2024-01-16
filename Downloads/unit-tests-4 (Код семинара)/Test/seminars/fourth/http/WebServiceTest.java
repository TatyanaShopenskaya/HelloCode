package seminars.fourth.http;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class WebServiceTest {
    String reply = "\"\\n\" +\n" +
            "                \"<!doctype html>\\n\" +\n" +
            "                        \"<html dir=\\\"ltr\\\" lang=\\\"en\\\"\\n\" +\n" +
            "                        \" chrome-refresh-2023>\\n\" +\n" +
            "                        \" <head>\\n\" +\n" +
            "                        \" <meta charset=\\\"utf-8\\\">\\n\" +\n" +
            "                        \" <title>New Tab</title>\\n\" +\n" +
            "                        \" <style>\\n\" +\n" +
            "                        \" body {\\n\" +\n" +
            "                        \" background: #FDFAEC;\\n\" +\n" +
            "                        \" margin: 0;\\n\" +\n" +
            "                        \" }\\n\" +\n" +
            "                        \"\\n\" +\n" +
            "                        \" #backgroundImage {\\n\" +\n" +
            "                        \" border: none;\\n\" +\n" +
            "                        \" height: 100%;\\n\" +\n" +
            "                        \" pointer-events: none;\\n\" +\n" +
            "                        \" position: fixed;\\n\" +\n" +
            "                        \" top: 0;\\n\" +\n" +
            "                        \" visibility: hidden;\\n\" +\n" +
            "                        \" width: 100%;\\n\" +\n" +
            "                        \" }\\n\" +\n" +
            "                        \"\\n\" +\n" +
            "                        \" [show-background-image] #backgroundImage {\\n\" +\n" +
            "                        \" visibility: visible;\\n\" +\n" +
            "                        \" }\\n\" +\n" +
            "                        \" </style>\\n\" +\n" +
            "                        \" </head>\\n\" +\n" +
            "                        \" <body>\\n\" +\n" +
            "                        \" <iframe id=\\\"backgroundImage\\\" src=\\\"chrome-untrusted://new-tab-page/custom_background_image?url=https%3A%2F%2Flh3.googleusercontent.com%2Fproxy%2FnMIspgHzTUU0GzmiadmPphBelzF2xy9-tIiejZg3VvJTITxUb-1vILxf-IsCfyl94VSn6YvHa8_PiIyR9d3rwD8ZhNdQ1C1rnblP6zy3OaI%3Dw3840-h2160-p-k-no-nd-mv\\\"></iframe>\\n\" +\n" +
            "                        \" <ntp-app></ntp-app>\\n\" +\n" +
            "                        \" <script type=\\\"module\\\" src=\\\"new_tab_page.js\\\"></script>\\n\" +\n" +
            "                        \" <link rel=\\\"stylesheet\\\" href=\\\"chrome://resources/css/text_defaults_md.css\\\">\\n\" +\n" +
            "                        \" <link rel=\\\"stylesheet\\\" href=\\\"chrome://theme/colors.css?sets=ui,chrome\\\">\\n\" +\n" +
            "                        \" <link rel=\\\"stylesheet\\\" href=\\\"shared_vars.css\\\">\\n\" +\n" +
            "                        \" </body>\\n\" +\n" +
            "                        \"</html>\\n\";";
    @Test
    void httpRequest() {
        HttpClient mockHttpClient=mock(HttpClient.class);
        when(mockHttpClient.get(anyString())).thenReturn(reply);  //anyString-значит, что можно передать любую строку
        WebService webService = new WebService(mockHttpClient);
        String result = webService.httpRequest("123");
        assertEquals(reply,result);
    }

}