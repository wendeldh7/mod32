package anotacao;

import java.lang.annotation.*;

/**
 * @author wendel.gomes
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}
