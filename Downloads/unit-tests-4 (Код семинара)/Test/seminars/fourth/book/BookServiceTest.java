// Задание 2
// У вас есть класс BookService, который использует интерфейс BookRepository
// для получения информации о книгах из базы данных.
// Ваша задача написать unit-тесты для BookService,
// используя Mockito для создания мок-объекта BookRepository.

package seminars.fourth.book;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {
    @Test
    public void testSearchBook() {
        BookRepository mockBookRepository = mock(BookRepository.class);   //mock для BookRepository
        when(mockBookRepository.findById("1")).thenReturn(new Book("1", "Book1", "Author1"));
        BookService bookService = new BookService(mockBookRepository);    // создали BookService и передали ему мок mockBookRepository
        Book searchBook = bookService.findBookById("1");   //вызвали метод поиска книги по Id

        assertEquals("Book1", searchBook.getTitle());
        assertEquals("Author1", searchBook.getAuthor());
    }

    @Test
    public void testSearchListBook() {
        BookRepository mockListBookRepository = mock(BookRepository.class);
        when(mockListBookRepository.findAll()).thenReturn(List.of(new Book("1", "Book1", "Author1")));
        BookService bookService = new BookService(mockListBookRepository);
        List<Book> searchList = bookService.findAllBooks();

        assertEquals(1, searchList.size());
        assertEquals("Book1", searchList.get(0).getTitle());
        assertEquals("Author1", searchList.get(0).getAuthor());
    }
}