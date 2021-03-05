package homework1;

/**
 * 4.1 Данный метод будет принимает два параметра
 * 	4.2 Будет отвечать на вопрос спать ли дальше (возвращать true либо false).
 * 	4.3 Первый параметр boolean weekday обозначает рабочий день
 * 	4.4 Второй параметр boolean vacation обозначает отпуск.
 * 	4.5 Если у нас отпуск или не рабочий день то мы можем спать дальше
 * 	4.6 На основании ответа от метода sleepIn вывести сообщение можем спать
 * 	дальше или пора идти на работу
 */
public class Home1_4 {


    public boolean sleepIn( boolean weekday , boolean vacation){
        return !weekday || vacation;
    }
}
