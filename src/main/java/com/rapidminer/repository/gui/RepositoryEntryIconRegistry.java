/**
 * Copyright (C) 2001-2020 by RapidMiner and the contributors
 *
 * Complete list of developers available at our web site:
 *
 * http://rapidminer.com
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU Affero General Public License as published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License along with this program.
 * If not, see http://www.gnu.org/licenses/.
 */
package com.rapidminer.repository.gui;


import com.rapidminer.repository.AbstractFileSuffixRegistry;


/**
 * Registry for icons for {@link com.rapidminer.repository.BinaryEntry BinaryEntries}.
 * <p>
 * Note that only one icon can be registered per file suffix (see {@link com.rapidminer.repository.BinaryEntry#getSuffix()}.
 * If there is already an icon registered, a new registration will silently fail (register method will return {@code
 * false}).
 * </p>
 * <p> Suffix is defined as the content after the last . in a file name. See {@link
 * com.rapidminer.repository.RepositoryTools#getSuffixFromFilename(String)}
 * </p>
 *
 * @author Marco Boeck
 * @since 9.7
 */
public class RepositoryEntryIconRegistry extends AbstractFileSuffixRegistry<IconProvider> {

	private static RepositoryEntryIconRegistry instance;


	/**
	 * Get the registry instance.
	 *
	 * @return the instance, never {@code null}
	 */
	public static synchronized RepositoryEntryIconRegistry getInstance() {
		if (instance == null) {
			instance = new RepositoryEntryIconRegistry();
		}

		return instance;
	}
}
