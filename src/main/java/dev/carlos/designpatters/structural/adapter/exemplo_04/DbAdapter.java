package dev.carlos.designpatters.structural.adapter.exemplo_04;

import lombok.NonNull;

import java.util.List;

public interface DbAdapter<ENTIDADE> {
    void save(@NonNull ENTIDADE entidade);
    void delete(@NonNull ENTIDADE entidade);
    ENTIDADE update(@NonNull ENTIDADE entidade);
    ENTIDADE finById(@NonNull Number id);
    List<ENTIDADE> findAll();
}
