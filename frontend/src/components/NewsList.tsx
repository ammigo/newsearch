import React, {Component} from 'react';
import styled from 'styled-components';
import NewsItem from './NewsItem';
import axios from 'axios';

const NewsListBlock = styled.div`
  box-sizing: border-box;
  padding-bottom: 3rem;
  width: 768px;
  margin: 0 auto;
  margin-top: 2rem;
  @media screen and (max-width: 768px) {
    width: 100%;
    padding-left: 1rem;
    padding-right: 1rem;
  }
`;

interface IProps {
    category: string
};

interface IStates {
    loading: boolean,
    articles: { url: string }[]
}

class NewsList extends Component<IProps, IStates> {
    state: IStates = {
        loading: false,
        articles: []
    };

    loadData = async () => {
        try {
            this.setState({
                loading: true
            });
            const {category} = this.props;
            const query = category === 'all' ? '' : `&category=${category}`;
            const response = await axios.get(
                `https://newsapi.org/v2/top-headlines?country=kr${query}&apiKey=0a8c4202385d4ec1bb93b7e277b3c51f`
            );
            this.setState({
                articles: response.data.articles
            });
        } catch (e) {
            console.log(e);
        }
        this.setState({
            loading: false
        });
    };

    componentDidUpdate(prevProps: any, prevState: any) {
        if (prevProps.category !== this.props.category) {
            this.loadData();
        }
    }

    componentDidMount() {
        this.loadData();
    }

    render() {
        const {articles, loading} = this.state;
        if (loading || !articles) {
            return <NewsListBlock>로딩중입니다.</NewsListBlock>;
        }
        return (
            <NewsListBlock>
                {articles.map(article => (
                    <NewsItem key={article.url} article={article}/>
                ))}
            </NewsListBlock>
        );
    }
}

export default NewsList;
