//Задание №7
//        Вам нужно написать тест с использованием моков для класса, который выполняет HTTP-запросы.
//        Условие: У вас есть класс HttpClient с методом public String get(String url), который выполняет
//        HTTP-запрос и возвращает результат. Вам необходимо проверить правильность работы класса
//        WebService, который использует HttpClient для получения данных с веб-сайта.


        package seminars.fourth.http;

public class HttpClient {

    public String get(String url) {
        return "\n" +
                "<!doctype html>\n" +
                        "<html dir=\"ltr\" lang=\"en\"\n" +
                        " chrome-refresh-2023>\n" +
                        " <head>\n" +
                        " <meta charset=\"utf-8\">\n" +
                        " <title>New Tab</title>\n" +
                        " <style>\n" +
                        " body {\n" +
                        " background: #FDFAEC;\n" +
                        " margin: 0;\n" +
                        " }\n" +
                        "\n" +
                        " #backgroundImage {\n" +
                        " border: none;\n" +
                        " height: 100%;\n" +
                        " pointer-events: none;\n" +
                        " position: fixed;\n" +
                        " top: 0;\n" +
                        " visibility: hidden;\n" +
                        " width: 100%;\n" +
                        " }\n" +
                        "\n" +
                        " [show-background-image] #backgroundImage {\n" +
                        " visibility: visible;\n" +
                        " }\n" +
                        " </style>\n" +
                        " </head>\n" +
                        " <body>\n" +
                        " <iframe id=\"backgroundImage\" src=\"chrome-untrusted://new-tab-page/custom_background_image?url=https%3A%2F%2Flh3.googleusercontent.com%2Fproxy%2FnMIspgHzTUU0GzmiadmPphBelzF2xy9-tIiejZg3VvJTITxUb-1vILxf-IsCfyl94VSn6YvHa8_PiIyR9d3rwD8ZhNdQ1C1rnblP6zy3OaI%3Dw3840-h2160-p-k-no-nd-mv\"></iframe>\n" +
                        " <ntp-app></ntp-app>\n" +
                        " <script type=\"module\" src=\"new_tab_page.js\"></script>\n" +
                        " <link rel=\"stylesheet\" href=\"chrome://resources/css/text_defaults_md.css\">\n" +
                        " <link rel=\"stylesheet\" href=\"chrome://theme/colors.css?sets=ui,chrome\">\n" +
                        " <link rel=\"stylesheet\" href=\"shared_vars.css\">\n" +
                        " </body>\n" +
                        "</html>\n";
    }
}