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
 * An exception that indicates that a superclass in not annotated with <code>@ALiteMappedSuperclass</code>.
 *
 * @author Guillaume Barré
 * @since 1.0
 *
 */
public class UnsupportedSupperClassException extends Exception{

	/**
	 *
	 */
	private static final long serialVersionUID = -5743246943261776708L;

	public UnsupportedSupperClassException(String msg){
		super(msg);
	}
}
