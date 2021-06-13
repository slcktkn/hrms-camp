package HumanResources.hrmsspringboot.core.utilities.business;

import java.util.Date;

import HumanResources.hrmsspringboot.core.utilities.results.ErrorResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessResult;

public abstract class BusinessRules {

	public static Result run(Result... rules) {
		for (Result rule : rules) {
			if (!rule.isSuccess()) {
				return new ErrorResult(rule.getMessage());
			}
		}
		return new SuccessResult();
	}

	public static boolean checkDate(Date startDate, Date endDate) {
		if (endDate != null) {
			if (!startDate.before(endDate)) {

				return false;
			}

		}

		return true;
	}

}
