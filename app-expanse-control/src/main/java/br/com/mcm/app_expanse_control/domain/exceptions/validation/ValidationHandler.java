package br.com.mcm.app_expanse_control.domain.exceptions.validation;

import java.util.List;

public interface ValidationHandler {

    ValidationHandler append(br.com.mcm.app_expanse_control.domain.exceptions.validation.Error anError);

    ValidationHandler append(ValidationHandler anHandler);

    <T> T validate(Validation<T> aValidation);

    List<br.com.mcm.app_expanse_control.domain.exceptions.validation.Error> getErrors();

    default boolean hasError() {
        return getErrors() != null && !getErrors().isEmpty();
    }

    default Error firstError() {
        if (getErrors() != null && !getErrors().isEmpty()) {
            return getErrors().get(0);
        } else {
            return null;
        }
    }

    interface Validation<T> {
        T validate();
    }

}
