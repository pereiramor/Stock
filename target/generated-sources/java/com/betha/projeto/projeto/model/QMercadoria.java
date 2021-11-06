package com.betha.projeto.projeto.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMercadoria is a Querydsl query type for Mercadoria
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMercadoria extends EntityPathBase<Mercadoria> {

    private static final long serialVersionUID = -237589261L;

    public static final QMercadoria mercadoria = new QMercadoria("mercadoria");

    public final com.betha.projeto.projeto.enterprise.QAbstractEntity _super = new com.betha.projeto.projeto.enterprise.QAbstractEntity(this);

    public final NumberPath<Double> altura = createNumber("altura", Double.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath nome = createString("nome");

    public final EnumPath<Pagamento> pagamento = createEnum("pagamento", Pagamento.class);

    public final NumberPath<Double> peso = createNumber("peso", Double.class);

    public final NumberPath<Double> valorUnitario = createNumber("valorUnitario", Double.class);

    public QMercadoria(String variable) {
        super(Mercadoria.class, forVariable(variable));
    }

    public QMercadoria(Path<? extends Mercadoria> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMercadoria(PathMetadata metadata) {
        super(Mercadoria.class, metadata);
    }

}

