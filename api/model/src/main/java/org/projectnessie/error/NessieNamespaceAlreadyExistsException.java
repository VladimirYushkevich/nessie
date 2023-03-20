/*
 * Copyright (C) 2020 Dremio
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.projectnessie.error;

/** This exception is thrown when the namespace with the same name already exists. */
public class NessieNamespaceAlreadyExistsException extends NessieConflictException {
  public NessieNamespaceAlreadyExistsException(String message, Throwable cause) {
    super(message, cause);
  }

  public NessieNamespaceAlreadyExistsException(String message) {
    super(message);
  }

  public NessieNamespaceAlreadyExistsException(NessieError error) {
    super(error);
  }

  @Override
  public ErrorCode getErrorCode() {
    return ErrorCode.NAMESPACE_ALREADY_EXISTS;
  }
}