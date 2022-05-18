.PHONY = deploy

App=datadog
bucket = wonderfl
s3prefix = builds
profile = hbc-common
region = us-east-1
templateFile = template.yaml
capabilities = CAPABILITY_IAM
directory = .aws-sam
generatedTemplateFile = ${directory}/template-generated.yaml

deploy: | $(directory)
	@echo "deploying to $(Todo)"
	sam build
	sam package --s3-bucket ${bucket} --s3-prefix ${s3prefix} --output-template-file ${generatedTemplateFile} --region ${region} --profile ${profile}
	sam deploy --template-file ${generatedTemplateFile} \
	--stack-name mp-lambda-test-$(App) \
	--capabilities ${capabilities} --profile ${profile} \
	--parameter-overrides App=${App} \

