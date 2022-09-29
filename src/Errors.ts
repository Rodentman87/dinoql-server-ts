export class RequestError extends Error {
	constructor(
		public statusCode: number,
		public messages: string | string[] | Record<string, any>
	) {
		super();
	}
}
