/*
 * Copyright (c) 2008 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.query.collections;

import com.mysema.query.grammar.JavaOps;


/**
 * ColQuery is the default implementation for Collection queries
 * 
 * @author tiwe
 * @version $Id$
 */
public class ColQuery extends AbstractColQuery<ColQuery>{

    public ColQuery(){
        super();
    }
    
    public ColQuery(JavaOps ops){
        super(ops);
    }
    
    public ColQuery(IteratorFactory iteratorFactory){
        super(iteratorFactory);
    }
    
    public ColQuery(JavaOps ops, IteratorFactory iteratorFactory){
        super(ops, iteratorFactory);
    }
    
}
