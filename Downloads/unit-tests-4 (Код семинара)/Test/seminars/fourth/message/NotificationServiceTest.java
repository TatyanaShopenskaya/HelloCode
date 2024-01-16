//Задание №5
//        Вам нужно написать тест с использованием моков для сервиса отправки сообщений.
//        Условие: У вас есть класс MessageService с методом public void sendMessage(String message, String
//        recipient), который отправляет сообщение получателю.
//        Вам необходимо проверить правильность работы класса NotificationService, который использует
//        MessageService для отправки уведомлений.


package seminars.fourth.message;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class NotificationServiceTest {
    @Test
    void notificationServiceTest(){
        MessageService messageServiceMock = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageServiceMock);
        notificationService.sendNotification("message","recipient");
        verify(messageServiceMock).sendMessage("message","recipient");
    }

}