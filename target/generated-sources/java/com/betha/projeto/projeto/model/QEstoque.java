package com.betha.projeto.projeto.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEstoque is a Querydsl query type for Estoque
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEstoque extends EntityPathBase<Estoque> {

    private static final long serialVersionUID = 810065132L;

    public static final QEstoque estoque = new QEstoque("estoque");

    public final com.betha.projeto.projeto.enterprise.QAbstractEntity _super = new com.betha.projeto.projeto.enterprise.QAbstractEntity(this);

    public final StringPath descricao = createString("descricao");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public QEstoque(String variable) {
        super(Estoque.class, forVariable(variable));
    }

    public QEstoque(Path<? extends Estoque> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEstoque(PathMetadata metadata) {
        super(Estoque.class, metadata);
    }

}

