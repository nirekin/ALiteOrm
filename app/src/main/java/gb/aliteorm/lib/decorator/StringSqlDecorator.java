/*
 * Copyright (C) 2015 Guillaume Barré
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package gb.aliteorm.lib.decorator;

/**
 * Decorator used to decorate "String".
 * <p>
 * This decorator will call <code>toString()</code> on the received object before proceeding to the decoration.
 *
 * @author Guillaume Barré
 * @since 1.0
 *
 */
public class StringSqlDecorator implements ISqlDecorator{

	private static final char SQL_ESCAPE = '\'';

	@Override
	public void decorate(StringBuilder strb, Object o){
		strb.append(SQL_ESCAPE)
		.append(o)
		.append(SQL_ESCAPE);
	}

	@Override
	public String decorate(Object o) {
		String s = o.toString();
		if(s.startsWith("'") && s.endsWith("'"))
			return s;
		return new StringBuilder()
		.append(SQL_ESCAPE)
		.append(o)
		.append(SQL_ESCAPE)
		.toString();
	}
}
