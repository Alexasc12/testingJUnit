import org.example.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class UserTest {

//    Создайте тест, который выполнит тестирование создания объекта User с передачей в него двух параметров.
//    Такая функция лишь должна проверять устанавливаются ли данные при создании объекта;

//    Создайте аналогичный тест, который выполнит тестирование по созданию объекта без передачи в него параметров;

//    Создайте тест, который протестирует установлен ли корректный Email адрес в поле email в классе User.
//    Некорректным будет считаться тот email, в котором нет знака @ или же знака точки.

    //    Создайте тест, который определяет, равны ли login и email (Они не должны быть равны).
    private final User out = new User();

    @Test
    public void checkLoginAndEmail() {
        User out = new User("user", "123@mail.com");
        Assertions.assertEquals("user", out.getLogin());
        Assertions.assertEquals("123@mail.com", out.getEmail());
    }

    @Test
    public void checkUser() {
        User out = new User();
        Assertions.assertEquals(null, out.getLogin());
        Assertions.assertEquals(null, out.getEmail());
    }

    @Test
    public void check () {
        User out = new User("user","123@mail.com");
        Assertions. assertTrue(out.getInstance(out.getLogin(),out.getEmail() ));
       Assertions. assertTrue( out.checkEmail(out.getEmail());
    }

}


