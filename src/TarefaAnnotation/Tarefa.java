package TarefaAnnotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR})
public @interface Tarefa {
    String value();

    String[] bairros();

    long numeroApartamento();
    double valores() default 10f;

}
