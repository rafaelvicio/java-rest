package br.com.rafaelvicio.siscorp.util;

import java.io.Serializable;

public interface Model<ID extends Serializable> extends Serializable {

    ID getId();
}