package dev.PavelEA.tomcat01.servlet;

import java.util.HashMap;
import java.util.Map;

public class AnswerConstructor {
    public static Map<Integer,String> answer = new HashMap<>();

    private static final String ANSWER_1 = "Обследовать местность! Необходимо быть уверенным в безопастности!";
    private static final String ANSWER_2 = "Добыть еды! Отправится за пределы деревушки и начать охоту!";
    private static final String ANSWER_3 = "Запастись дровами! Буря обещает быть очень холодной, нам необходимо тепло";
    private static final String ANSWER_4 = "В этой деревне безопастно, возвращаемся назад!";
    private static final String ANSWER_5 = "Нужно проверить эти дома. Аккуратно заходим внутрь!";
    private static final String ANSWER_6 = "Собираем все в округе! Обязательно возьмем то, что осталось от радиостанции, попробуем ее восстановить!";
    private static final String ANSWER_7 = "Все отправляемся по следам, ищем животных! К деревьям вернемся позже!";
    private static final String ANSWER_8 = "Разделимся! Те, кто с топопрами останутся рубить, остальные по следам!";
    private static final String ANSWER_9 = "Сделаем то, зачем мы сюда пришли! Собираем все, что горит!";
    private static final String ANSWER_10 = "Идем дальше по лесу! Всем быть на чеку!";
    private static final String ANSWER_11 = "Выходим в поле! Всем смотреть по сторонам!";
    private static final String ANSWER_12 = "Исследуем лесопилку!";
    private static final String ANSWER_13= "Ночь на дворе! Идем в убежище!";
    private static final String ANSWER_14 = "Ничего не трогаем, уходим! Лучше соберем что сможем по дороге в убежище!";
    private static final String ANSWER_15 = "Берем сколько сможем и валим!";
    private static final String ANSWER_16 = "Теперь это наш дом, берите что хотите!";
    private static final String ANSWER_17 = "Неизвестно когда начнется буря! Остаемся пережидать!";
    private static final String ANSWER_18 = "Нужно попробовать завести автомобиль! Толкаем все вместе!";
    private static final String ANSWER_19 = "Сейчас это авто просто металлолом! Заберите все что можно и возвращаемся домой!";
    private static final String ANSWER_20 = "Переносим дрова в убежище и можно будет отдохнуть!";
    private static final String ANSWER_21 = "Возвращаемся в лес, идем по следам!";
    private static final String ANSWER_22 = "Мы можем притащить пикап сюда и попробовать починить!";
    private static final String ANSWER_23 = "Нужно найти бензин для пикапа, тогда мы сможем уехать в Рассвет!";
    private static final String ANSWER_24 = "Нужно исследовать край этой деревни! Там мы можем найти все, что нам нужно для выживания!";
    private static final String ANSWER_25 = "Нужно ехать к Рассвету прямо сейчас! Если не хватит бензина, бросим машину!";
    private static final String ANSWER_26 = "Давайте изучим эти строения!";
    public static void createAnswers(){
        answer.put(1, ANSWER_1);
        answer.put(2, ANSWER_2);
        answer.put(3, ANSWER_3);
        answer.put(4, ANSWER_4);
        answer.put(5, ANSWER_5);
        answer.put(6, ANSWER_6);
        answer.put(7, ANSWER_7);
        answer.put(8, ANSWER_8);
        answer.put(9, ANSWER_9);
        answer.put(10, ANSWER_10);
        answer.put(11, ANSWER_11);
        answer.put(12, ANSWER_12);
        answer.put(13, ANSWER_13);
        answer.put(14, ANSWER_14);
        answer.put(15, ANSWER_15);
        answer.put(16, ANSWER_16);
        answer.put(17, ANSWER_17);
        answer.put(18, ANSWER_18);
        answer.put(19, ANSWER_19);
        answer.put(20, ANSWER_20);
        answer.put(21, ANSWER_21);
        answer.put(22, ANSWER_22);

    }
    public static String getAnswer(Integer number){
        return answer.get(number);
    }

}

