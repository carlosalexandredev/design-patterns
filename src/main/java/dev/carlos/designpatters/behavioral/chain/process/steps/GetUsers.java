package dev.carlos.designpatters.behavioral.chain.process.steps;

import dev.carlos.designpatters.behavioral.chain.process.repository.UserRepository;
import dev.carlos.designpatters.behavioral.chain.process.service.ProcessContext;

public class GetUsers extends ProcessStep {
	
	public GetUsers(Object... args) {
		super(args);
	}

	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		Object users = UserRepository.getInstance().getUsers();
		context.put("users", users);
		return next(context, users);
	}

}
