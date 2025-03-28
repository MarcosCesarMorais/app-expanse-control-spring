package br.com.mcm.app_expanse_control.domain.exceptions;

import br.com.mcm.app_expanse_control.domain.exceptions.handler.Notification;

public class NotificationException extends DomainException{

    public NotificationException(final String aMessage, final Notification notification) {
        super(aMessage, notification.getErrors());
    }
}
