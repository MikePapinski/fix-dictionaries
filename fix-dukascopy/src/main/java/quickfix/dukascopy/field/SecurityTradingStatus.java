/* Generated Java Source File */
/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package quickfix.dukascopy.field;

import quickfix.IntField;


public class SecurityTradingStatus extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 326;
	public static final int OPENING_DELAY = 1;
	public static final int TRADING_HALT = 2;
	public static final int RESUME = 3;
	public static final int NO_OPEN_NO_RESUME = 4;
	public static final int PRICE_INDICATION = 5;
	public static final int TRADING_RANGE_INDICATION = 6;
	public static final int MARKET_IMBALANCE_BUY = 7;
	public static final int MARKET_IMBALANCE_SELL = 8;
	public static final int MARKET_ON_CLOSE_IMBALANCE_BUY = 9;
	
	public SecurityTradingStatus() {
		super(326);
	}

	public SecurityTradingStatus(int data) {
		super(326, data);
	}
	
}
