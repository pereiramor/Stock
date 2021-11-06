package com.betha.projeto.projeto.enterprise;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAbstractPessoa is a Querydsl query type for AbstractPessoa
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QAbstractPessoa extends EntityPathBase<AbstractPessoa> {

    private static final long serialVersionUID = 59711375L;

    public static final QAbstractPessoa abstractPessoa = new QAbstractPessoa("abstractPessoa");

    public final QAbstractEntity _super = new QAbstractEntity(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath nome = createString("nome");

    public final StringPath telefone = createString("telefone");

    public QAbstractPessoa(String variable) {
        super(AbstractPessoa.class, forVariable(variable));
    }

    public QAbstractPessoa(Path<? extends AbstractPessoa> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAbstractPessoa(PathMetadata metadata) {
        super(AbstractPessoa.class, metadata);
    }

}

