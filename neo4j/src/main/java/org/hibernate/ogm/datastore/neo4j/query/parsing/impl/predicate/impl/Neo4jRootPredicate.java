/*
 * Hibernate OGM, Domain model persistence for NoSQL datastores
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.ogm.datastore.neo4j.query.parsing.impl.predicate.impl;

import org.hibernate.hql.ast.spi.predicate.RootPredicate;
import org.hibernate.ogm.datastore.neo4j.query.parsing.cypherdsl.impl.CypherExpression;

/**
 * @author Davide D'Alto &lt;davide@hibernate.org&gt;
 */
public class Neo4jRootPredicate extends RootPredicate<CypherExpression> {

	@Override
	public CypherExpression getQuery() {
		if ( child == null ) {
			return null;
		}
		else {
			return child.getQuery();
		}
	}

}
