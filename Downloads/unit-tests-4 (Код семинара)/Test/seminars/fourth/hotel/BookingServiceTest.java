//Задание №4
//        Вам необходимо написать тест с использованием моков для сервиса бронирования отелей.
//        Условие: У вас есть класс HotelService с методом public boolean isRoomAvailable(int roomId),
//        который обычно проверяет, доступен ли номер в отеле.
//        Вам необходимо проверить правильность работы класса BookingService, который
//        использует HotelService для бронирования номера, если он доступен.
package seminars.fourth.hotel;

import org.junit.jupiter.api.Test;
import seminars.fourth.hotel.BookingService;
import seminars.fourth.hotel.HotelService;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookingServiceTest {
    @Test
    void bookingServiceTest(){
        HotelService hotelService = mock(HotelService.class);
        BookingService bookingService = new BookingService(hotelService);
        when(hotelService.isRoomAvailable(3)).thenReturn(false);

        Boolean result = bookingService.bookRoom(3);
        assertThat(result).isEqualTo(false);
    }

}