/*
 *	Copyright Technophobia Ltd 2012
 *
 *   This file is part of Substeps.
 *
 *    Substeps is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU Lesser General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    Substeps is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public License
 *    along with Substeps.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.technophobia.substeps.document.formatting.strategy;

import org.eclipse.core.runtime.Status;
import org.eclipse.jface.text.formatter.IFormattingStrategy;

import com.technophobia.substeps.FeatureEditorPlugin;
import com.technophobia.substeps.document.formatting.FormattingContext;
import com.technophobia.substeps.supplier.Supplier;

public class StartOfUnitFormattingStrategy extends DefaultFormattingStrategy {

	private final IFormattingStrategy formattingStrategy;
	private final Supplier<FormattingContext> formattingContextSupplier;

	public StartOfUnitFormattingStrategy(
			final Supplier<FormattingContext> formattingContextSupplier,
			final IFormattingStrategy formattingStrategy) {
		this.formattingContextSupplier = formattingContextSupplier;
		this.formattingStrategy = formattingStrategy;

	}

	@Override
	public String format(final String content, final boolean isLineStart,
			final String indentation, final int[] positions) {
		FeatureEditorPlugin.log(Status.INFO, "Formatting line: " + content
				+ ", isLineStart: " + isLineStart + ", indentation: "
				+ indentation);
		return super.format(content, isLineStart, indentation, positions);
	}
}
