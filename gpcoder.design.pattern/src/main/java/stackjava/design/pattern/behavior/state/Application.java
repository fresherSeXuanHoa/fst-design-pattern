package stackjava.design.pattern.behavior.state;

public class Application {
	public static void main(String[] args) {
		DocumentService documentService = new DocumentService(new NewState());

		documentService.checkState();
		
		documentService.setState(new ApprovedState());
		documentService.checkState();
		
		documentService.setState(new RejectedState());
		documentService.checkState();
		
		documentService.setState(new DraftState());
		documentService.checkState();
	}
}
