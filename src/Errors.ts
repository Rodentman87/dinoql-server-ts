export class RequestError extends Error {
	constructor(public statusCode: number, public messages: string | string[]) {
		super();
	}
}
