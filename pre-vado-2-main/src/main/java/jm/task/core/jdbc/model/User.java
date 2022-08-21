package jm.task.core.jdbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//Аннотации над классом:
// 1)из пакета javax.persistence. поставь аннотацию которая будет говорить, что данный бин (класс) является сущностью.
// 2)из пакета javax.persistence. поставь аннотацию которая, указывает на имя таблицы, которая будет отображаться в этой сущности. (присвой имя таблицы)
// 3)из фрейворка lombok. поставь аннотацию, которая содержит в себе возможности из @ToString, @EqualsAndHashCode, @Getter / @Setter и @RequiredArgsConstructor.
// 4)из фрейворка lombok. поставь аннотацию, которая  генерирует конструктор без параметров. (в дальнейшем пустой конструктор, будет позволять совершать метод delete())
// 5)из фрейворка lombok. поставь аннотацию, которая генерирует конструктор с одним параметром для каждого поля в классе.
public class User {

    //Аннотации над полем Long id:
    // 1)из пакета javax.persistence. поставь аннотацию которая, будет генерировать уникальный id, для jpa сущности
    // 2)из пакета javax.persistence. поставь аннотацию которая, предназначена для настройки способа увеличения указанного столбца (поля). (в параметры передай тип стратегии)
    private Long id;


    private String name;


    private String lastName;


    private Byte age;
    //p.s - над поями после id, можно явно указать имя поля, оно должно совпадать с именем переменной, реализовавается с помошью специальной  аннотации
    // из пакета javax.persistence. , в параметры которой ты и пишешь имя поля в таблице
}