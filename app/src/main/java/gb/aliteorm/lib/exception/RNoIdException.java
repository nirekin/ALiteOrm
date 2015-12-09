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

package gb.aliteorm.lib.exception;

/**
 * An exception that indicates that the schema contains a Object used like
 * an entity which has no getter annotated with the <code>@ALiteId</code> or 
 * <code>@ALiteEmbeddedId</code> annotations.
 *
 * @author Guillaume Barré
 * @since 1.0
 *
 */
public class RNoIdException extends RuntimeException{

	/**
	 *
	 */
	private static final long serialVersionUID = -8673722774435965837L;

	public RNoIdException(String msg){
		super(msg);
	}
}
